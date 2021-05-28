const express = require("express");
const { fileUploadController } = require("../controllers/fileController");
const router = express.Router();

const routes = () => {
  router.get("/", (req, res) => {
    res.json({
      msg: "Hello World",
    });
  });

  router.post("/upload", fileUploadController);

  return router;
};

module.exports = routes;
