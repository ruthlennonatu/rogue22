### Table of Contents
**[Object Role Model Diagram](#object-role-model-diagram)**<br>
**[ORM Notation](#orm-notation)**<br>
**[Rogue22 System ORM](#rogue22-system-orm)**<br>
**[Rogue22 ORM Notes](#rogue22-orm-notes)**<br>
**[Useful Links](#useful-links)**<br>
**[Entity Relationship Diagram](#entity-relationship-diagram)**<br>
**[Rogue22 ERD Explained](#rogue22-erd-explained)**<br>

## Object Role Model Diagram

### What is an ORM?

An ORM is a type of graphical conceptual diagram based on facts. In practice, ORMs are considered to be more efficient at capturing requirements due to them being understood by non-technical users relatively easily. This is largely due to the amount of plain english used in these diagrams. 

## ORM Notation

![ORM Symbols](https://www.softwareideas.net/i/DirectImage/1933/orm-symbols-overview)


### Notation explanation

ORM notation is based off first order predicate logic and set theory. Some core symbols used in ORM diagrams include:

* Entity - an object with its own identity and life cycle. It exists independently and is identified as a rectangle or ellipse with a solid border. Entities are equivalent to entities in entity relationship diagrams sometimes referred to as "tables".

* Value - an object that cannot exist independently; it is tied to an entity and only exists so long as the entity does. It is depicted as a rectangle or ellipse with a dashed border.

* Predicate - connects two or more objects. The number of boxes within a predicate indicates the number of associations.

* Objectifier - defines a separate object for an assocation, such as another entity.

## Rogue22 System ORM

![Rogue22 ORM](https://github.com/ruthlennonatu/rogue22/blob/dev/Documentation/Database/rogue22_ORM.png)

### Rogue22 ORM Explained

In the ORM as seen above, we have 5 entities.

1. Account
2. Privilges
3. Venue
4. Ticket
5. Workshop

With the account entity, we can see it is associated with two predicates in the top left corner, but note it is only one entity connecting them. The role identifier, as seen in blue text, "admin" and "customer" indicates a unary relationship. This is because an account can be of type customer or admin, which is why an admin account can manage a customer's account without the need for two individual entities.

In the diagram we can also see that the account entity is associated with another predicate with objectifiers containing other entities (venue and ticket). In the small blue text within the rounded box, words, known as fact types, briefly describe the "fact". An account must be of type customer to make a booking, detailed in the booking will be the where the venue is held (the venue address), described as "...held in..." and the types of tickets selected, "...selected...".

We can implement objectification to this booking process by wrapping it in a box and giving it it's own fact type as indicated by "Booking" or "Booked" (as a customer will only be in the process of one or the other). The purple line indicates uniqueness, as it covers each predicate within the booking objectification, this shows that each individual booking is unique.

## Rogue22 ORM Notes

* ORMs are not covered on the Computer Science course, they may not be appropriate to use due to lack of knowledge/practice with them.

* Based on research, there are no free tools specifically to produce an ORM.

* ER & UML diagrams continue to be a more popular approach to designing a database schema.

## Useful Links
Document covering ORM syntax and semantics in detail: [ORM abstract syntax and semantics glossary](https://gitlab.com/orm-syntax-and-semantics/orm-syntax-and-semantics-docs)

Official site for [conceptual data modeling](http://www.orm.net/#:~:text=Dr%20Terry%20Halpin%20is%20a,and%20over%20200%20technical%20papers.)


## Entity Relationship Diagram

![Rogue22 - ERD](https://github.com/ruthlennonatu/rogue22/blob/dev/Documentation/Database/rogue22_ERD_chennnotation.png)

## Rogue22 ERD Explained

As per the specification, we know there are two clearly defined entities - a customer and an admin. An admin should have acccess to detailed information (this diagram assumes that information is customer details, this could also include accessing workshop/venue/ticket information and therefore would need appropriate amendments made).

A customer should be able to enter their details, read this and not be able to change once submitted. A customer should not have access to the admin interface. A possible way of separating these two entities is by making them login with their own account details. 

Both entities will have an account, each account is of an account type (admin or customer). Each account type has priviliges associated with it. By implementing priviliges, this promotes database security by restricting access to data.

Because an account can be of type customer or admin, a unary relationship is shown. An admin account can manage a customer account's details. If logged into a customer account, they can select tickets to purchase and make a booking and subsequently, view a number of workshops within the venue.

### Rogue22 ERD Notes

* This diagram follows the chen notation style

* UMLet was used to produce this diagram

* "Notes" are added to the diagram for further explanation

testing commit