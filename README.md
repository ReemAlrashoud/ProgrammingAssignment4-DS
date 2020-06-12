# ProgrammingAssignment4-DS
## 1-Introduction 
One of the main functionalities offered by online social platforms such as Facebook and Twitter
is the recommendation of new friends. This is achieved by utilizing various information about
the users, but the main factor used for recommending a new friend to a user is how well these
two users are connected. A social network such as Facebook can be represented as undirected
graph such as the one shown in Figure 1. We can use the information contained in the graph
to select the top candidate friends for a given user. There are many ways to do this, but we
will focus on two methods:

**1. Popular users:** In this method, we recommend the most popular users in the graph,that is nodes with the highest degrees (number of neighbors).

**2. Common neighbors:** In this method, we recommend users who have the most common
friends with the user.

## 2-The data structures
In this section, we present the data structures necessary for this assignment.

**2.1 Implementing a top k priority queue**
To recommend top k users, we use a priority queue that keeps only the top k elements and
serves them in decreasing order of priority. For this, write the class PQKImp that implements the
interface PQK.

**2.2 Implementing a map**
In this step, you write a BST implementation of a map.

## 3-Representing the social network
To represent the friendship graph , We will use adjacency list representation, but instead of an array of lists, we use a map
of lists. Each list in the map represents the neighbors of a node. Write the class MGraph that
implements the interface Graph. 

## 4-The friends recommender
Write the class Recommender that implements the two friends recommendation methods

