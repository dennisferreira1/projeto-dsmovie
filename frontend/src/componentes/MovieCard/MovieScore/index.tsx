import MovieStar from 'componentes/MovieCard/MovieStar';
import './styles.css';

function MovieScore() {
    const score = 2;
    const count = 5;
    return (
        <div className="dsmovie-score-container">
            <p className="dsmovie-score-value">{score > 0 ? score.toFixed(1) : '-'}</p>
            <MovieStar />
            <p className="dsmovie-score-count">{count} avaliações</p>
        </div>
    );
}

export default MovieScore;