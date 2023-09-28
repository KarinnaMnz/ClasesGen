const pokemonImagen = document.querySelector(".imagen");
const pokemonNombre = document.querySelector(".nombre");
const pokemonNumero = document.querySelector(".numero");
let numerodePokemon = 1;
// para consumir una api fetch existe dos formas
// 1) fetch then catch
// es ideal para cuando queramos anidar bloques de códigos o metodos
async function fetchPokemon(pokemon) {
  const url = `https://pokeapi.co/api/v2/pokemon/${pokemon}`;
  fetch(url)
    .then((respuesta) => {
      return respuesta.json(); // esto requiere ejecutarse dentro de un bloque de código
    })
    .then((data) => console.log(data));
}
// 2 fetch usando try catch
const fetchPokemon2 = async (pokemon) => {
  try {
    const url = `https://pokeapi.co/api/v2/pokemon/${pokemon}`;
    const respuesta = await fetch(url);
    if (respuesta.status === 200) {
      const data = await respuesta.json();
      return data;
    } else {
      console.log("error " + respuesta.status + " desede el servidor");
    }
  } catch (error) {
    console.log("error al hacer la petición " + error);
  }
};
const cargaDePokemon = async (pokemon) => {
  const mypokemon = await fetchPokemon2(pokemon);
  if (mypokemon) {
    console.log(mypokemon);
    pokemonNombre.innerHTML = mypokemon.name;
    pokemonNumero.innerHTML = mypokemon.id;
    pokemonImagen.src =
      mypokemon["sprites"]["versions"]["generation-v"]["black-white"][
        "animated"
      ]["front_default"];
  }
};
cargaDePokemon(numerodePokemon);
