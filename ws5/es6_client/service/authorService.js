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
    window.location.reload(true);
  }

  find(id, callback) {
    // NOT tested, just a hint ...
    console.log(id);
    window.$.ajax({
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
  delete(id, callback) {
    // TODO
    console.log(id);
    console.log(this.baseUrl+id);
    window.$.ajax({
        url: this.baseUrl + id,
        type: "DELETE",
        dataType: "json",
        crossDomain: true,
        context: this, // MUST have!!!
      }).done(data => {
        console.log("deleted " + id);
      })
      .fail(msg => {
        console.log(msg);
      })
    window.location.reload(true);

  }

  update(id, author, callback) {
    // TODO
    console.log(JSON.stringify(author));
     window.$.ajax({
        url: this.baseUrl + id,
        data: JSON.stringify(author),
        method: "UPDATE",
        dataType: "json",
        crossDomain: true,
        context: this, // MUST have!!!
      }).done(data => {
        console.log("updated " + author.id);
      })
      .fail(msg => {
        console.log(msg);
      })
    //window.location.reload();
  }
}

// Export object
export const authService = new AuthorService();
