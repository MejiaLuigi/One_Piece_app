import React from "react";
import logoOp from "../assets/logoOP.png"
import "../style/style.css"

export function NavBar() {
    return(
        <nav>
            <div className="left">
                <img src={logoOp} className="navImg" alt="logo" />
            </div>
            <div className="right">
                <h1>Welcome!</h1>
            </div>
        </nav>
    )
}
