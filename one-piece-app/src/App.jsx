
import './App.css'
import { useEffect, useState } from 'react'
import { CardsCharacter } from './components/CardsCharacter'
import { NavBar } from './components/NavBar'
import { SearchBar } from './components/SearchBar'
import { getApiData } from './services/getApiData';

function App() {
  getApiData()
  // const onSearchHandler = (character) =>{

  //         searchCharacter(character)
  //         .then((data) =>{
  //           setDataCharacter(data)
  //           console.log(data)
  //         })
  //     }

    

  return (
    <>
    <h1>HOLA</h1>
      <NavBar/>
      <SearchBar/>
      <CardsCharacter/>
    </>
  )
}

export default App
