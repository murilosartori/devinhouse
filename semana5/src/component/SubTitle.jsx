import React from 'react'

const SubTitle = props => {
    const { title, children } = props;
    return (
        <div>
            <h2>{title}</h2>
            {children}
        </div>
    )
}

export default SubTitle;