/*
   Table for author.html using jQuery Data table
   See https://datatables.net/

*/
import {
  boCat
} from "../model/bookCatalogue.js"

// Column data definition (see also HTML page)
const columns = [{
    data: "isbn"
  },
  {
    data: "title"
  },
  {
    data: "genre"
  },
  {
    data: "price"
  }
];

// Create and add table when DOM fully constructed
$(document).ready(function() {
  let books = boCat.findAll();
  let table = $('#book').DataTable({
    data: books,
    columns: columns  // Must be here
  });
});
