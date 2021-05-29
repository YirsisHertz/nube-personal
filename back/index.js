const express = require("express");
const fileUpload = require("express-fileupload");
const cors = require("cors");
const app = express();

const router = require("./router");

app.use(cors());

app.use(
  fileUpload({
    createParentPath: true,
  })
);

app.use("/", router());

app.listen(3300);
