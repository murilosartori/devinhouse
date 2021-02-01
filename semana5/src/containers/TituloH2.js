import { Typography } from "@material-ui/core";

function TituloH2(props) {
    const { titulo } = props;
    return (
        <Typography variant="h4" component="h2" gutterBottom color="primary">
            {titulo}
        </Typography>
    )
}

export default TituloH2;