Chapter 4.10.2
Page: 205

4.10.2 Class Comments
The class comment must be placed after any import statements, directly
before the class definition.
Here is an example of a class comment:


```java
/**
* A {@code Card} object represents a playing card, such
* as "Queen of Hearts". A card has a suit (Diamond, Heart,
* Spade or Club) and a value (1 = Ace, 2 . . . 10, 11 = Jack,
* 12 = Queen, 13 = King)
*/
public class Card
{
. . .
}
```


NOTE:
There is no need to add an * in front of every line. For example, the
following comment is equally valid:


```java
/**
A <code>Card</code> object represents a playing card, such
as "Queen of Hearts". A card has a suit (Diamond, Heart,
Spade or Club) and a value (1 = Ace, 2 . . . 10, 11 = Jack,
12 = Queen, 13 = King).
*/
```


However, most IDEs supply the asterisks automatically and rearrange them
when the line breaks change.