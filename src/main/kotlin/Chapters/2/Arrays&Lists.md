# Chapter 2

## Arrays and Lists

**Arrays**
* Uses a sequential space in memory 
* Easier to get a item on a specific position
* Faster to read slower to insert and delete

**Linked Lists**
* More flexible than arrays to insert,
don't need to replace stick all the items on sequential memory slots
* Items have a memory address to get the next item on the list (might be a problem if want a mid list item)
* Faster to insert and delete slower to read
* Linked lists can only do sequential access

*Insertions and deletions*
* Insertions and deletions are easier on a list, you only have to change the address of the next item,
rather then have to move all the other elements on both cases on arrays. 

**Quote:**
*"It’s worth mentioning that insertions and deletions are O(1) time only
if you can instantly access the element to be deleted. It’s a common
practice to keep track of the first and last items in a linked list, so it
would take only O(1) time to delete those."*

## Exercises Answers

**2.2 ->**

*Mine:* Linked list is better the app is basically doing insertions and removals on the list, this case is a LILO (last in, last out)

*Book:* A linked list. Lots of inserts are happening (servers
adding orders), which linked lists excel at. You don’t need search
or random access (what arrays excel at), because the chefs always
take the first order off the queue.

**2.3 ->**

*Mine:* Array here, linked lists aren't able to do random access, and reading on arrays are constant time "O(1)"

*Book:* A sorted array. Arrays give you random access—you can
get an element from the middle of the array instantly. You can’t
do that with linked lists. To get to the middle element in a linked
list, you’d have to start at the first element and follow all the links
down to the middle element.

**2.4 ->**

*Mine:* Inserts in arrays are O(n) so it's can became very slow as the list growth. When adding a new user to the arrays we have to move all the other users to a new memory slot.

*Book:* Inserting into arrays is slow. Also, if you’re using binary
search to search for usernames, the array needs to be sorted.
Suppose someone named Adit B signs up for Facebook. Their
name will be inserted at the end of the array. So you need to sort
the array every time a name is inserted!

**2.5 ->**

*Mine:* Faster to insertions and slower to searching.

*Book:* Searching—slower than arrays, faster than linked lists.
Inserting—faster than arrays, same amount of time as linked lists.
So it’s slower for searching than an array, but faster or the same
as linked lists for everything. We’ll talk about another hybrid
data structure called a hash table later in the book. This should
give you an idea of how you can build up more complex data
structures from simple ones.

