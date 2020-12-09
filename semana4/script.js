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
