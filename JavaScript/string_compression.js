let input = "abc";
let count = 1;
let currentChar = input[0];
let result = "";
for (let i = 1; i < input.length; i++) {
  if (currentChar === input[i]) {
    count++;
  } else {
    result = result + currentChar + count;
    currentChar = input[i];
    count = 1;
  }
}
result = result + currentChar + count;
console.log(result.length < input.length ? result : input);
