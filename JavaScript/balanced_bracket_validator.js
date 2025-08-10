let input = "{[(])}";

function isBalanced(expression) {
  const stack = [];
  const opening = "([{";
  const closing = ")]}";

  for (let i = 0; i < expression.length; i++) {
    const char = expression[i];
    if (opening.includes(char)) {
      stack.push(char);
    } else if (closing.includes(char)) {
      const top = stack.pop();
      if (opening.indexOf(top) !== closing.indexOf(char)) {
        return false;
      }
    }
  }
  return stack.length === 0;
}

console.log("Is balanced: " + isBalanced(input));
