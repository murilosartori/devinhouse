import React, { Component } from 'react'

class Cabecalho extends Component {
    render() {
        return (
            <div>
                <div>
                    <h1>DEVinHouse First React App - Semana 5</h1>
                    <h2>{this.props.title}</h2>
                </div>
                {this.props.children}
            </div>
        )
    }
}

export default Cabecalho;