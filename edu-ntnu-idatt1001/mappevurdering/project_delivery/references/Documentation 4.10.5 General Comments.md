Chapter 4.10.5 General Comments
Page 207

The tag @since text makes a “since” entry. The text can be any description of
the version that introduced this feature. For example, `@since 1.7.1`.
The following tags can be used in class documentation comments:

• @author name

This tag makes an “author” entry. You can have multiple @author tags, one
for each author. Don’t feel compelled to use this tag—your version control
system does a more thorough job tracking authorship.

• @version text

This tag makes a “version” entry. The text can be any description of the
current version.
You can use hyperlinks to other relevant parts of the javadoc documentation,
or to external documents, with the @see and @link tags.
The tag @see reference adds a hyperlink in the “see also” section. It can be
used with both classes and methods. Here, reference can be one of the
following:


```java
package.class#feature label
<a href=". . .">label</a>
"text"
```


The first case is the most useful. You supply the name of a class, method, or
variable, and javadoc inserts a hyperlink to the documentation. For example,


```java
@see com.horstmann.corejava.Employee#raiseSalary(double)
```


makes a link to the raiseSalary(double) method in the `com.horstmann.corejava.Employee` class. You can omit the name of the
package, or both the package and class names. Then, the feature will be
located in the current package or class. Note that you must use a #, not a
period, to separate the class from the method or variable name. The Java
compiler itself is highly skilled in determining the various meanings of the
period character as separator between packages, subpackages, classes, inner
classes, and methods and variables. But the javadoc utility isn’t quite as
clever, so you have to help it along.
If the @see tag is followed by a < character, then you need to specify a
hyperlink. You can link to any URL you like. For example:


```java
@see <a href="www.horstmann.com/corejava.html">The Core Java
home page</a>
```


In each of these cases, you can specify an optional label that will appear as
the link anchor. If you omit the label, the user will see the target code name
or URL as the anchor.
If the @see tag is followed by a " character, then the text is displayed in the
“see also” section. For example:


```java
@see "Core Java 2 volume 2"
```


You can add multiple @see tags for one feature, but you must keep them all
together.
If you like, you can place hyperlinks to other classes or methods anywhere in
any of your documentation comments. Insert a special tag of the form


```java
{@link package.class#feature label}
```


anywhere in a comment. The feature description follows the same rules as
for the @see tag.
Finally, as of Java 9, you can use the {@index entry} tag to add an entry to
the search box.