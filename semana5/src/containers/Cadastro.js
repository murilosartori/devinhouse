import { Box, Paper, Typography, TextField, Button, Grid, FormControl, FormLabel, FormControlLabel, RadioGroup, Radio, List, ListItem, ListItemText, ListItemSecondaryAction, IconButton } from "@material-ui/core";
import { Add, Edit } from "@material-ui/icons";
import DeleteIcon from '@material-ui/icons/Delete';
import TituloH2 from "./TituloH2";

function Cadastro(props) {
    const { aluno, setAluno, alunos, setAlunos } = props;

    const handleChange = ({ name, value }) => {
        console.log(name, value);
        setAluno({ ...aluno, [name]: value });
    };
    const handleAdd = () => {
        let nomeAutorizado = document.getElementById('autorizados').value;
        let autorizados = aluno.autorizados;
        autorizados.push({ "nome": nomeAutorizado });
        setAluno({ ...aluno, "autorizados": autorizados });
        document.getElementById('autorizados').value = "";
    };
    const handleSubmit = (e) => {
        e.preventDefault();
        const alunoNaLista = alunos.some((item) => item.id === aluno.id);
        if (alunoNaLista) {
            const result = alunos.map((item) => item.id === aluno.id ? aluno : item);
            setAlunos(result);
        } else {
            setAlunos([...alunos, { ...aluno, id: Math.random().toString(36).substr(2, 9) }]);
        }
        setAluno({ id: 0, nome: "", nascimento: "", telefone: "", responsavel: "", contatoemergencia: "", telefoneemergencia: "", restricao: 0, qualrestricao: "", autorizacaoimagem: 0, autorizados:[] });
    };
    const handleNew = () => {
        setAluno({ id: 0, nome: "", nascimento: "", telefone: "", responsavel: "", contatoemergencia: "", telefoneemergencia: "", restricao: 0, qualrestricao: "", autorizacaoimagem: 0, autorizados:[] });
    }
    return (
        <Box component={Paper} p={2}>
            <TituloH2 titulo="Cadastro de Aluno" />
            <Box component="form" onSubmit={handleSubmit}>
                <Grid container spacing={1}>
                    <Grid item xs={12} sm={12}>
                        <TextField variant="outlined" size="small" label="Nome do Aluno" fullWidth margin="dense" value={aluno.nome} name="nome" onChange={(e) => handleChange(e.target)} />
                    </Grid>
                    <Grid item xs={12} sm={6}>
                        <TextField variant="outlined" size="small" label="Data Nascimento" fullWidth margin="dense" value={aluno.nascimento} name="nascimento" onChange={(e) => handleChange(e.target)} />
                    </Grid>
                    <Grid item xs={12} sm={6}>
                        <TextField variant="outlined" size="small" label="Telefone Contato" fullWidth margin="dense" value={aluno.telefone} name="telefone" onChange={(e) => handleChange(e.target)} />
                    </Grid>
                    <Grid item xs={12} sm={12}>
                        <TextField variant="outlined" size="small" label="Nome do Responsável" fullWidth margin="dense" value={aluno.responsavel} name="responsavel" onChange={(e) => handleChange(e.target)} />
                    </Grid>
                    <Grid item xs={12} sm={6}>
                        <TextField variant="outlined" size="small" label="Contato para Emergências" fullWidth margin="dense" value={aluno.contatoemergencia} name="contatoemergencia" onChange={(e) => handleChange(e.target)} />
                    </Grid>
                    <Grid item xs={12} sm={6}>
                        <TextField variant="outlined" size="small" label="Telefone Emergência" fullWidth margin="dense" value={aluno.telefoneemergencia} name="telefoneemergencia" onChange={(e) => handleChange(e.target)} />
                    </Grid>
                    <Grid item xs={12} sm={6}>
                        <FormControl component="fieldset">
                            <FormLabel component="legend">Restrição Alimentar?</FormLabel>
                            <RadioGroup row aria-label="position" name="position" defaultValue="0">
                                <FormControlLabel value="1" control={<Radio color="primary" />} label="Sim" name="restricao" onChange={(e) => handleChange(e.target)} />
                                <FormControlLabel value="0" control={<Radio color="primary" />} label="Não" name="restricao" onChange={(e) => handleChange(e.target)} />
                            </RadioGroup>
                        </FormControl>
                    </Grid>
                    <Grid item xs={12} sm={6} className="hidden">
                        <TextField variant="outlined" size="small" label="Qual Restrição?" fullWidth margin="dense" value={aluno.qualrestricao} name="qualrestricao" onChange={(e) => handleChange(e.target)} />
                    </Grid>
                    <Grid item xs={12} sm={12}>
                        <FormControl component="fieldset">
                            <FormLabel component="legend">Autoriza divulgação de foto e video da criança?</FormLabel>
                            <RadioGroup row aria-label="position" name="position" defaultValue="0">
                                <FormControlLabel value="1" control={<Radio color="primary" name="autorizacaoimagem" onChange={(e) => handleChange(e.target)} />} label="Sim" />
                                <FormControlLabel value="0" control={<Radio color="primary" name="autorizacaoimagem" onChange={(e) => handleChange(e.target)} />} label="Não" />
                            </RadioGroup>
                        </FormControl>
                    </Grid>
                    <Grid item xs={10} sm={10}>
                        <TextField variant="outlined" size="small" label="Quem pode buscar o aluno?" fullWidth margin="dense" id="autorizados" />
                    </Grid>
                    <Grid item xs={2} sm={2}>
                        <Button variant="contained" color="primary" style={{ marginRight: "10px", marginTop: "8px" }} startIcon={<Add />} onClick={handleAdd}>Adicionar</Button>
                    </Grid>
                    <Grid item xs={12} md={12}>
                        <Typography variant="h6">
                            Lista de autorizados para buscar a criança
                        </Typography>
                        <List>
                            {aluno.autorizados.map((a) => (
                                <ListItem>
                                    <ListItemText>{a.nome}</ListItemText>
                                    <ListItemSecondaryAction>
                                        <IconButton edge="end" aria-label="delete">
                                            <DeleteIcon />
                                        </IconButton>
                                    </ListItemSecondaryAction>
                                </ListItem>
                            ))}
                        </List>
                    </Grid>
                    <Grid item xs={12} md={12}>
                        <Button variant="contained" color="primary" size="large" onClick={handleNew}>
                            Novo
                        </Button>
                        <Button variant="contained" color="primary" type="submit" size="large" style={{ marginLeft: "20px" }}>
                            Salvar
                        </Button>
                    </Grid>
                </Grid>
            </Box>
        </Box>
    );
}

export default Cadastro;