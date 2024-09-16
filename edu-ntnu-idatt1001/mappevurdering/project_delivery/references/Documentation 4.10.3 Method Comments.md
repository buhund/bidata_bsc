Chapter 4.10.3
Page: 206

4.10.3 Method Comments
Each method comment must immediately precede the method that it
describes. In addition to the general-purpose tags, you can use the following
tags:
• @param variable description
This tag adds an entry to the “parameters” section of the current method.
The description can span multiple lines and can use HTML tags. All @param
tags for one method must be kept together.
• @return description
This tag adds a “returns” section to the current method. The description can
span multiple lines and can use HTML tags.
• @throws class description
This tag adds a note that this method may throw an exception. Exceptions
are the topic of Chapter 7.
Here is an example of a method comment:


```java
/**
* Raises the salary of an employee.
* @param byPercent the percentage by which to raise the
salary (e.g., 10 means 10%)
* @return the amount of the raise
*/
public double raiseSalary(double byPercent)
{
double raise = salary * byPercent / 100;
salary += raise;
return raise;
}
```
