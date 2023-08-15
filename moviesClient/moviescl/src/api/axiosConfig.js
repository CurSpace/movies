import axios from "axios";

export default axios.create({
    baseURL:'https://ae95-75-1-1-249.ngrok.io/',
    headers: {"ngrok-skip-browser-warning": "true"}
});