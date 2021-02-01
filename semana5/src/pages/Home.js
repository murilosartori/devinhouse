import { Box, Grid, Typography } from "@material-ui/core";
import { useState } from "react";
import Cadastro from "../containers/Cadastro";
import Listagem from "../containers/Listagem";

function Home() {
    const [aluno, setAluno] = useState({ id: 0, nome: "", nascimento: "", telefone: "", responsavel: "", contatoemergencia: "", telefoneemergencia: "", restricao: 0, qualrestricao: "", autorizacaoimagem: 0, autorizados:[] });
    const [alunos, setAlunos] = useState([]);

    return (
        <Box m={4}>
            <Typography variant="h2" component="h1" align="center" gutterBottom color="textSecondary">
                Gestão de Alunos
            </Typography>

            <Grid container spacing={2}>
                <Grid item xs={12} sm={12}>
                    <Cadastro aluno={aluno} setAluno={setAluno} alunos={alunos} setAlunos={setAlunos}></Cadastro>
                </Grid>

                <Grid item xs={12} sm={12}>
                    <Listagem aluno={aluno} setAluno={setAluno} alunos={alunos} setAlunos={setAlunos}></Listagem>
                </Grid>
            </Grid>
        </Box>
    );
}

export default Home;