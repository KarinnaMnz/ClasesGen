import { useEffect, useState } from "react";
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
    correo: "max@algo.com",
    avatar: user,
  },
  posts: [
    {
      post_id: "1",
      postContenido:
        "This impressive paella is a perfect party dish and a fun meal to cook together with your guests. Add 1 cup of frozen peas along with the mussels, if you like.",
      postFecha: "",
      postComentarios: [
        {
          comentario_id: "1",
          comentarioTexto:
            "This impressive paella is a perfect party dish and a fun meal to cook together with your guests. Add 1 cup of frozen peas along with the mussels, if you like.",
          comentarioFecha: "",
        },
        {
          comentario_id: "2",
          comentarioTexto:
            "This impressive paella is a perfect party dish and a fun meal to cook together with your guests. Add 1 cup of frozen peas along with the mussels, if you like.",
          comentarioFecha: "",
        },
      ],
      counterLikes: 4,
    },
    {
      post_id: "2",
      postContenido:
        "This impressive paella is a perfect party dish and a fun meal to cook together with your guests. Add 1 cup of frozen peas along with the mussels, if you like.",
      postFecha: "",
      postComentarios: [
        {
          comentario_id: "1",
          comentarioTexto:
            "This impressive paella is a perfect party dish and a fun meal to cook together with your guests. Add 1 cup of frozen peas along with the mussels, if you like.",
          comentarioFecha: "",
        },
        {
          comentario_id: "2",
          comentarioTexto:
            "This impressive paella is a perfect party dish and a fun meal to cook together with your guests. Add 1 cup of frozen peas along with the mussels, if you like.",
          comentarioFecha: "",
        },
      ],
      counterLikes: 10,
    },
  ],
};
export default function App() {
  const [data, setData] = useState({});
  // useEffect( () => {<bloque> } )
  //          func.anónima
  useEffect(() => {
    console.log("holi");
    setData(_data);
  }, []);
  useEffect(() => {
    console.log("toy escuchando");
  }, [data]);
  console.log(data);
  return (
    <>
      {/* Este es un comentario */}
      {data.posts && (
        <>
          <Header
            titulo={ConfigPage.titulo}
            anio={ConfigPage.anio}
            avatarUser={data.usuario.avatar}
          />
          <Main>
            <PostForm userPost={data.usuario} />{" "}
            {/* pasando otro componente como propiedad "Children" */}
            {/* <Post post={_data.posts} /> */}
            {data.posts.map((item) => (
              <div key={item.post_id}>
                <Post post={item} />
              </div>
            ))}
          </Main>
          <Footer autor={ConfigPage.autor} />
        </>
      )}
    </>
  );
}
