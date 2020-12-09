// [SP04] 1 - Cálculo de Média de Notas
function media(arrayNotas) {
    if (arrayNotas.length > 0) {
        let soma = 0;
        let media = 0;
        arrayNotas.forEach(element => {
            soma += element;
        });
        media = soma / arrayNotas.length;
        console.log('A média das notas é: ' + media);
    }
}


//[SP04] - 2 - Quadrado de valores
function quadrado(...arrayQuadrado) {
    let quadrado = arrayQuadrado.map(function(num) {
        return Math.pow(num, 2);
    });
    console.log(quadrado);
}


//[SP04] - 3 - Verificação de Maioridade de Pessoas
let arrayPessoas = [
    { nome: 'João', idade: 15, telefone: '(16) 99999-9999', profissao: 'Estudante' },
    { nome: 'Maria', idade: 68, telefone: '(16) 99999-9999', profissao: 'Aposentada' },
    { nome: 'Pedro', idade: 34, telefone: '(16) 99999-9999', profissao: 'Programador' },
    { nome: 'Carlos', idade: 10, telefone: '(16) 99999-9999', profissao: 'Estudante' },
    { nome: 'Rita', idade: 49, telefone: '(16) 99999-9999', profissao: 'Bancária' },
    { nome: 'Renata', idade: 21, telefone: '(16) 99999-9999', profissao: 'Programador' },
    { nome: 'Marcos', idade: 14, telefone: '(16) 99999-9999', profissao: '' },
]
function maioridade(pessoas) {
    let pessoaMaioridade = pessoas.some(function(pessoa) {
        return pessoa.idade >= 18;
    });
    console.log('Tem pessoal maior de idade: ' + pessoaMaioridade);
}


//[SP04] 4 - Verificação de Profissão
function MesmaProfissao(pessoas) {
    let mesmaProfissao = pessoas.every(function(pessoa) {
        pessoa.profissao === 'Programador';
    });
    console.log('Todas as pessoas são programadoras: ' + mesmaProfissao);
}


//[SP04] 5 - Listar o nome das pessoas
function ArrayNomePessoas(pessoas) {
    let nomePessoas = pessoas.map(function(pessoa) {
        return pessoa.nome;
    });
    console.log(nomePessoas);
}


//[SP04] 6 - Encontrar as pessoas menores de 18 anos
function ArrayPessoasMenorIdade(pessoas) {
    let menorIdade = pessoas.filter(function(pessoa) {
        return pessoa.idade < 18;
    });
    console.log(menorIdade);
}
