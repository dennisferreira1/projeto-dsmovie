import FormCard from "componentes/FormCard";
import { useParams } from "react-router-dom";

function Form() {

    const params = useParams();

    return (
        <FormCard movieId={`${params.movieId}`} />
    );
}

export default Form;