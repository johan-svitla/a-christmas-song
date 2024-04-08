function generateTwelveDaysOfChristmas() {
  const days = [
    "first",
    "second",
    "third",
    "fourth",
    "fifth",
    "sixth",
    "seventh",
    "eighth",
    "ninth",
    "tenth",
    "eleventh",
    "twelfth",
  ];

  const gifts = [
    "a Partridge in a Pear Tree.",
    "two Turtle Doves,",
    "three French Hens,",
    "four Calling Birds,",
    "five Gold Rings,",
    "six Geese-a-Laying,",
    "seven Swans-a-Swimming,",
    "eight Maids-a-Milking,",
    "nine Ladies Dancing,",
    "ten Lords-a-Leaping,",
    "eleven Pipers Piping,",
    "twelve Drummers Drumming,",
  ];

  let song = "";
  for (let i = 0; i < days.length; i++) {
    song += `On the ${days[i]} day of Christmas my true love gave to me: `;
    for (let j = i; j >= 0; j--) {
      song += gifts[j] + (j === 0 ? "" : " ");
    }
    song += "\n";
  }

  return song;
}

// Example usage:
console.log(generateTwelveDaysOfChristmas());
