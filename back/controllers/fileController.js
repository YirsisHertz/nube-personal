const fileUploadController = (req, res) => {
  if (!req.files) {
    return res.status(500).json({
      error: "Necesitas enviar un archivo",
    });
  }

  file = req.files.imagen;
  savePath = "./files/" + file.name;

  console.clear();
  console.log(file);

  file.mv(savePath, (err) => {
    if (err) {
      return res.json(err);
    }

    return res.json({
      state: "ok",
      msg: "Archivo guardado",
    });
  });

  // files.map((file) => {

  //
  // });
};

module.exports = {
  fileUploadController,
};
