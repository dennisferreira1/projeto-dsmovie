import {ReactComponent as StarFull} from 'assets/img/starfull.svg';
import {ReactComponent as StarHalf} from 'assets/img/starhalf.svg';
import {ReactComponent as StarEmpty} from 'assets/img/starempty.svg';
import './styles.css';

function MovieStar() {
    return (
        <div className="dsmovie-stars-container">
            <StarFull />
            <StarFull />
            <StarFull />
            <StarHalf />
            <StarEmpty />
        </div>
    );
}

export default MovieStar;