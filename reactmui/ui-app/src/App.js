import Footer from "./component/Footer";
import Header from "./component/Header";
import Main from "./component/Main";
import PostForm from "./component/PostForm";
import Post from "./component/Post";
import user from "./images/alex.jpg";
const ConfigPage = {
  titulo: "Cohorte 7",
  autor: "@kari",
  anio: "2023",
};
const _data = {
  usuario: {
    nombre: "Max",
    carreo: "max@algo.com",
    avatar: user,
  },
  posts: [
    {
      post_id: "1",
      postContenido: "",
      postFecha: "",
      postComentarios: [
        { comentario_id: "1" },
        { comentarioTexto: "" },
        { comentarioFecha: "" },
      ],
      counterLikes: 4,
    },
  ],
};
export default function App() {
  return (
    <>
      {/* Este es un comentario */}
      <Header
        titulo={ConfigPage.titulo}
        anio={ConfigPage.anio}
        avatarUser={_data.usuario.avatar}
      />
      <Main>
        <PostForm userPost={_data.usuario} />{" "}
        {/* pasando otro componente como propiedad "Children" */}
        <Post />
      </Main>
      <Footer autorr={ConfigPage.autor} />
    </>
  );
}
