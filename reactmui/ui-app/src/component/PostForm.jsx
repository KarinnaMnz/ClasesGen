import Button from "@mui/material/Button";
import TextField from "@mui/material/TextField";
export default function PostForm() {
  return (
    <div className="content-post-form">
      <TextField
        id="filled-multiline-static"
        label="Multiline"
        multiline
        rows={4}
        defaultValue="Post"
        variant="filled"
        sx={{ width: "90%", margin: "15px 0" }}
      />
      <Button
        sx={{ width: "90%", margin: "15px 0" }}
        variant="contained"
        color="success"
      >
        Guardar
      </Button>
         
    </div>
  );
}
