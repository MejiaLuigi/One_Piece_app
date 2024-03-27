import React from "react";
import search from '../assets/search.svg'

export function SearchBar() {
    // const [character, setCharacter] = useState('');

    // //Aqui pasamos la función onSearchHandles como un props
    // const onSearchSubmit = (event) => {

    //     event.preventDefault();
    //     console.log('Searching for:', character);
        
    //   }; //Ayuda la legibilidad del codigo

    return(
        <div >
            <form  className='searchBar' >
                <input
                type="text"
                className="input-search"
                placeholder="Search"
                
                />
                <button type="submit" className="btnSearch">
                   <img src={search} alt="button search" width="18" height="18" />
                </button>
            </form>
        </div>
    )
}
