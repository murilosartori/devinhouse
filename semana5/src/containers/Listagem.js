import { Box, Button, Paper, Table, TableBody, TableCell, TableHead, TableRow, Typography } from "@material-ui/core";
import { Edit, Delete } from "@material-ui/icons";
import TituloH2 from "./TituloH2";

function Listagem(props) {
    const { aluno, setAluno, alunos, setAlunos } = props;

    const handleEdit = (id) => {
        const alunoClicado = alunos.find((aluno) => aluno.id === id);
        setAluno(alunoClicado);
    };
    const handleDelete = (id) => {
        const result = alunos.filter((aluno) => aluno.id !== id);
        setAlunos(result);
    };
    return (
        <Box component={Paper} p={2}>
            <TituloH2 titulo="Listagem de Alunos" />
            <Table>
                <TableHead>
                    <TableRow>
                        <TableCell align="center">Nome</TableCell>
                        <TableCell align="center">Data Nascimento</TableCell>
                        <TableCell align="center">Turma</TableCell>
                        <TableCell align="center">Telefone Emergência</TableCell>
                        <TableCell align="center">Contato Emergência</TableCell>
                        <TableCell></TableCell>
                    </TableRow>
                </TableHead>
                <TableBody>
                    {alunos.map((linha) => (
                        <TableRow key={linha.id}>
                            <TableCell align="center">{linha.nome}</TableCell>
                            <TableCell align="center">{linha.nascimento}</TableCell>
                            <TableCell align="center">{linha.nome}</TableCell>
                            <TableCell align="center">{linha.telefoneemergencia}</TableCell>
                            <TableCell align="center">{linha.contatoemergencia}</TableCell>
                            <TableCell align="center">
                                <Button variant="contained" color="primary" style={{ marginRight: "10px" }} startIcon={<Edit />} onClick={() => handleEdit(linha.id)}>
                                    Editar
                                </Button>
                                <Button variant="contained" color="secondary" startIcon={<Delete />} onClick={() => handleDelete(linha.id)}>
                                    Deletar
                                </Button>
                            </TableCell>
                        </TableRow>
                    ))}
                </TableBody>
            </Table>
        </Box>
    )
}

export default Listagem;