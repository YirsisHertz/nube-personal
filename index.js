const express = require("express");
const fileUpload = require("express-fileupload");
const app = express();

const router = require("./router");

app.use(
  fileUpload({
    createParentPath: true,
  })
);

app.use("/", router());

app.listen(3300);
