package com.devsuperior.dsmovie.services;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.dto.ScoreDTO;
import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.entities.Score;
import com.devsuperior.dsmovie.entities.User;
import com.devsuperior.dsmovie.repositories.MovieRepository;
import com.devsuperior.dsmovie.repositories.ScoreRepository;
import com.devsuperior.dsmovie.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScoreService {

    @Autowired
    private ScoreRepository scoreRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MovieRepository movieRepository;

    @Transactional
    public MovieDTO saveScore(ScoreDTO scoreDTO) {
        User user = getUser(scoreDTO);
        Movie movie = movieRepository.findById(scoreDTO.getMovieId()).get();

        Score score = new Score();
        score.setUser(user);
        score.setMovie(movie);
        score.setValue(scoreDTO.getScore());
        scoreRepository.saveAndFlush(score);

        updateMovie(score, movie);

        movie = movieRepository.save(movie);
        return new MovieDTO(movie);
    }

    private User getUser(ScoreDTO scoreDTO) {
        User user = userRepository.findByEmail(scoreDTO.getEmail());
        if(user == null) {
            user = new User();
            user.setEmail(scoreDTO.getEmail());
            user = userRepository.saveAndFlush(user);
        }
        return user;
    }

    private void updateMovie(Score score, Movie movie) {
        // busca a lista de scores relacionada ao movie
        List<Score> listScore = scoreRepository.findAll()
                .stream()
                .filter(s -> s.getId().getMovie().getId().equals(movie.getId()))
                .collect(Collectors.toList());

        // soma valores dos scores
        Double sum = 0.0;
        for (Score s : listScore) {
            sum += s.getValue();
        };
        // calcula a média
        int count = listScore.size();
        Double avg = sum / count;

        movie.setScore(avg);
        movie.setCount(count);
    }
}
