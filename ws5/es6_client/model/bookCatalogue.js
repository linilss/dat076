/*
   Collection of Authors
*/
import {
  Book
} from "./book.js"
import {
  eventBus as eB
} from "../util/eventBus.js"
import {
  bookService as bs
} from "../service/bookService.js"

class BookCatalogue {

  constructor() {
    // Test data used when not connected to back end
    this.books = [
        new Book("123", "Himmelen", "Drama", "10.0"),
        new Book("456", "När getterna sover", "Skräck", "20.5"),
        new Book("789", "Sverige - En historia", "Politik", "5.0")
      ];

  } 

  find(isbn) {
    return this.books.find(b => b.isbn === isbn);
  }

  findAll() {
    // When using AJAX uncomment this
    /*bs.findAll(data => {
      return eB.notify("", data);
    })*/
    // No backend use this, comment out when using AJAX
    return this.books;
  }

  create(book) {
    // TODO Add AJAX
    this.books.push(book);
    eB.notify("ADD", this.books); // First param not used
  }

  update(book) {
    // TODO Add AJAX
    var b = this.find(book.isbn);
    this.books = this.books.filter(elem => elem !== b);
    this.books.push(book);
    eB.notify("UPDATE", this.books);
  }

  delete(isbn) {
    // TODO Add AJAX
    var b = this.find(isbn);
    this.books = this.books.filter(elem => elem !== b);
    eB.notify("DELETE", this.books);
  }
}

// Singleton
export const boCat = new BookCatalogue();
