import axios from 'axios';

export async function getApiData(){
    const urlApi = `http://localhost:8080`
    
    try{
        const responseDataApi = await axios.get(`${urlApi}/api/v1/character/search?nameCharacters=Roronoa%20Zoro`);
        console.log(responseDataApi.data)
        return responseDataApi.data;
    }catch(error) {
        console.log("THIS IS AN ERROR", error)
    }
}
