import React, { Component } from 'react'
import Cabecalho from '../component/Cabecalho'
import SubTitle from '../component/SubTitle'

class Esqueleto extends Component {
    render() {
        return (
            <React.Fragment>
                <Cabecalho title="Escola DEVinHouse">
                    <SubTitle title="Cadastro / Edição de Aluno"></SubTitle>
                    <SubTitle title="Listagem de Alunos"></SubTitle>
                </Cabecalho>
            </React.Fragment>
        )
    }
}

export default Esqueleto;