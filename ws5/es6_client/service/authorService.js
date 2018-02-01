/*
    Service to execute AJAX call to backend
*/

class AuthorService {

  constructor() {
    // Possible need to modify this
    this.baseUrl = "http://localhost:8080/ws4/rest/author/";
    //this.baseUrl = "http://localhost:8080/api/authors/";
  }

  findAll(callback) { // Callback is a function
    window.$.ajax({ // Use ugly global variable!
        url: this.baseUrl,
        method: "GET",
        context: this // MUST have!!!
      }).done(data => { // Success!
        callback(data);
      })
      .fail(msg => { // Exception!
        console.log(msg);
      })
  }

  create(author, callback) {
    // NOT tested, just a hint ...
    window.$.ajax({
        url: this.baseUrl,
        data: author,
        method: "POST",
        dataType: "json",
        crossDomain: true,
        context: this, // MUST have!!!
      }).done(data => {
        callback(data);
      })
      .fail(msg => {
        console.log(msg);
      })
  }

  find(id, callback) {
    // NOT tested, just a hint ...
    console.log(id);
    $.ajax({
        url: this.baseUrl + id,
        method: "GET",
        crossDomain: true,
        context: this, // MUST have!!!
      }).done(data => {
        callback(data);
      })
      .fail(msg => {
        console.log(msg);
      })
  }
  delete(id) {
    // TODO
    console.log(id);
    console.log(this.baseUrl+id);
    $.ajax({
        url: this.baseUrl + id,
        type: "DELETE",
        dataType: "json",
        crossDomain: true,
        context: this, // MUST have!!!
      })
      .fail(msg => {
        console.log(msg);
      })
  }

  update(id) {
    // TODO
    $.ajax({
        url: this.baseUrl + id,
        method: "UPDATE"
    }).done(data => {
        callback(data);
    }).fail(msg => {
        console.log(msg);
    })
  }
}

// Export object
export const authService = new AuthorService();
