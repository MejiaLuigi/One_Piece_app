import React from "react";
import logoOp from "../assets/logoOP.png"

export function CardsCharacter() {
    return(
            <section className="content-container">
                <div className="container">
                    <div className="content-right">
                        <img className="cardImg" src={logoOp} alt="" />
                    </div>
                    <div className="content-left">
                        <p>hola</p>
                        <p>aqui estoy</p>
                    </div>
                </div>
            </section>  
    )
}
