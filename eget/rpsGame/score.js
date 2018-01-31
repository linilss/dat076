p1 = document.getElementById("p1");
p2 = document.getElementById("p2");
winner = document.getElementById('winner');
p1Score = 0;
p2Score = 0;
p1Btn = document.getElementById("bp1");
p2Btn = document.getElementById("bp2");
var gameOver = false;

p1Btn.addEventListener('click', function() {
	if(!gameOver) {
		winner.textContent = "";
		p1Score++;
		if(p1Score === 3) {
			winner.textContent = "p1 wins!"
			reset();
		}
		p1.textContent = p1Score;
	}
});
p2Btn.addEventListener('click', function() {
	if(!gameOver) {
		winner.textContent = "";
		p2Score++;
		if(p2Score === 3) {
			winner.textContent = "p2 wins!"
			reset();
		}
		p2.textContent = p2Score;
	}
});

function reset() {
	p1Score = 0;
	p2Score = 0;
	p1.textContent = "0";
	p2.textContent = "0";

}