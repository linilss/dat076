/*
   Collection of Authors
*/
import {
  Author
} from "./author.js"
import {
  eventBus as eB
} from "../util/eventBus.js"
import {
  authService as as
} from "../service/authorService.js"

class AuthorRegistry {

  constructor() {
    // Test data used when not connected to back end
    this.authors = [
        new Author("OO", "ollesson", "olle", "olle@com", "ollev"),
        new Author("FF", "fiassosadn", "fia", "fia@com", "fiav"),
        new Author("LL", "lisasson", "lisa", "lisa@com", "lisav")
      ];

  } 

  find(id) {
    as.find((id, data) => {
      return eb.notify("", data);
    })
    //return this.authors.find(a => a.id === id);
  }

  findAll() {
    // When using AJAX uncomment this
    as.findAll(data => {
      return eB.notify("", data);
    })
    // No backend use this, comment out when using AJAX
    //return this.authors;
  }

  create(author) {
    // TODO Add AJAX
    //this.authors.push(author);
    as.create(author, data => {
      return eB.notify("ADD", author);
    })
    //eB.notify("ADD", this.authors); // First param not used
  }

  update(author) {
    // TODO Add AJAX
    var a = find(author.id);
    this.authors = this.authors.filter(elem => elem !== a);
    this.authors.push(author);
    eB.notify("UPDATE", this.authors);
  }

  delete(id) {
    // TODO Add AJAX
    as.delete(id);
    eB.notify("", id);
    //this.authors = this.authors.filter(elem => elem !== a);
    //eB.notify("DELETE", this.authors);
  }
}

// Singleton
export const authReg = new AuthorRegistry();
