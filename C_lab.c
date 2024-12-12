// #include <stdio.h>
// #include <stdlib.h>
// #include <string.h>

//01> Merge two files and Usn sorting

// #define MAX 100

// void mergeFiles(const char *file1, const char *file2, const char *mergedFile) {
//     FILE *fp1 = fopen(file1, "r");
//     FILE *fp2 = fopen(file2, "r");
//     FILE *fp3 = fopen(mergedFile, "w");

//     if (!fp1 || !fp2 || !fp3) {
//         perror("Error opening file");
//         exit(1);
//     }

//     char usn1[MAX], usn2[MAX];
//     int commonPrinted = 0;

//     if (fscanf(fp1, "%s", usn1) != 1) strcpy(usn1, "");
//     if (fscanf(fp2, "%s", usn2) != 1) strcpy(usn2, "");

//     printf("Common USNs:\n");

//     while (strlen(usn1) > 0 || strlen(usn2) > 0) {
//         if (strlen(usn1) > 0 && strlen(usn2) > 0) {
//             if (strcmp(usn1, usn2) == 0) {
//                 fprintf(fp3, "%s\n", usn1);
//                 printf("%s\n", usn1);
//                 if (fscanf(fp1, "%s", usn1) != 1) strcpy(usn1, "");
//                 if (fscanf(fp2, "%s", usn2) != 1) strcpy(usn2, "");
//                 commonPrinted = 1;
//             } else if (strcmp(usn1, usn2) < 0) {
//                 fprintf(fp3, "%s\n", usn1);
//                 if (fscanf(fp1, "%s", usn1) != 1) strcpy(usn1, "");
//             } else {
//                 fprintf(fp3, "%s\n", usn2);
//                 if (fscanf(fp2, "%s", usn2) != 1) strcpy(usn2, "");
//             }
//         } else if (strlen(usn1) > 0) {
//             fprintf(fp3, "%s\n", usn1);
//             if (fscanf(fp1, "%s", usn1) != 1) strcpy(usn1, "");
//         } else {
//             fprintf(fp3, "%s\n", usn2);
//             if (fscanf(fp2, "%s", usn2) != 1) strcpy(usn2, "");
//         }
//     }

//     if (!commonPrinted) {
//         printf("No common USNs found.\n");
//     }

//     fclose(fp1);
//     fclose(fp2);
//     fclose(fp3);
// }

// int main() {
//     const char *file1 = "file1.txt";
//     const char *file2 = "file2.txt";
//     const char *mergedFile = "merged.txt";

//     printf("Merging files '%s' and '%s' into '%s'.\n\n", file1, file2, mergedFile);
//     mergeFiles(file1, file2, mergedFile);

//     printf("\nMerged file '%s' created successfully with unique USNs.\n", mergedFile);
//     return 0;
// }

//02> Infix to Postfix Expr

// #include <stdio.h>
// #include <stdlib.h>
// #include <ctype.h>
// #include <string.h>

// #define MAX 100

// typedef struct {
//     char items[MAX];
//     int top;
// } Stack;

// void initStack(Stack *s) {
//     s->top = -1;
// }

// int isEmpty(Stack *s) {
//     return s->top == -1;
// }

// int isFull(Stack *s) {
//     return s->top == MAX - 1;
// }

// void push(Stack *s, char item) {
//     if (isFull(s)) {
//         printf("Stack overflow!\n");
//         exit(1);
//     }
//     s->items[++s->top] = item;
// }

// char pop(Stack *s) {
//     if (isEmpty(s)) {
//         printf("Stack underflow!\n");
//         exit(1);
//     }
//     return s->items[s->top--];
// }

// char peek(Stack *s) {
//     if (isEmpty(s)) {
//         return '\0';
//     }
//     return s->items[s->top];
// }

// int precedence(char op) {
//     switch (op) {
//         case '+':
//         case '-':
//             return 1;
//         case '*':
//         case '/':
//             return 2;
//         default:
//             return 0;
//     }
// }

// int isOperator(char ch) {
//     return ch == '+' || ch == '-' || ch == '*' || ch == '/';
// }

// int isBalanced(const char *expression) {
//     Stack s;
//     initStack(&s);

//     for (int i = 0; expression[i] != '\0'; i++) {
//         if (expression[i] == '(') {
//             push(&s, '(');
//         } else if (expression[i] == ')') {
//             if (isEmpty(&s)) {
//                 return 0; // Unbalanced
//             }
//             pop(&s);
//         }
//     }
//     return isEmpty(&s);
// }

// void infixToPostfix(const char *infix, char *postfix) {
//     Stack s;
//     initStack(&s);
//     int k = 0;

//     for (int i = 0; infix[i] != '\0'; i++) {
//         if (isalnum(infix[i])) {
//             postfix[k++] = infix[i];
//         } else if (infix[i] == '(') {
//             push(&s, '(');
//         } else if (infix[i] == ')') {
//             while (!isEmpty(&s) && peek(&s) != '(') {
//                 postfix[k++] = pop(&s);
//             }
//             if (!isEmpty(&s) && peek(&s) == '(') {
//                 pop(&s);
//             }
//         } else if (isOperator(infix[i])) {
//             while (!isEmpty(&s) && precedence(peek(&s)) >= precedence(infix[i])) {
//                 postfix[k++] = pop(&s);
//             }
//             push(&s, infix[i]);
//         }
//     }

//     while (!isEmpty(&s)) {
//         postfix[k++] = pop(&s);
//     }

//     postfix[k] = '\0';
// }

// int main() {
//     char infix[MAX], postfix[MAX];

//     printf("Enter a parenthesized arithmetic expression: ");
//     scanf("%s", infix);

//     if (!isBalanced(infix)) {
//         printf("The expression is not balanced!\n");
//         return 1;
//     }

//     infixToPostfix(infix, postfix);

//     printf("Infix Expression: %s\n", infix);
//     printf("Postfix Expression: %s\n", postfix);

//     return 0;
// }


// 03> Postfix calculator

// #include <stdio.h>
// #include <stdlib.h>
// #include <ctype.h>
// #include <string.h>

// #define MAX 100

// typedef struct {
//     int items[MAX];
//     int top;
// } Stack;

// void initStack(Stack *s) {
//     s->top = -1;
// }

// int isEmpty(Stack *s) {
//     return s->top == -1;
// }

// int isFull(Stack *s) {
//     return s->top == MAX - 1;
// }

// void push(Stack *s, int item) {
//     if (isFull(s)) {
//         printf("Stack overflow!\n");
//         exit(1);
//     }
//     s->items[++s->top] = item;
// }

// int pop(Stack *s) {
//     if (isEmpty(s)) {
//         printf("Stack underflow!\n");
//         exit(1);
//     }
//     return s->items[s->top--];
// }

// int evaluatePostfix(const char *postfix) {
//     Stack s;
//     initStack(&s);

//     for (int i = 0; postfix[i] != '\0'; i++) {
//         if (isdigit(postfix[i])) {
//             push(&s, postfix[i] - '0');
//         } else {
//             int operand2 = pop(&s);
//             int operand1 = pop(&s);
//             switch (postfix[i]) {
//                 case '+':
//                     push(&s, operand1 + operand2);
//                     break;
//                 case '-':
//                     push(&s, operand1 - operand2);
//                     break;
//                 case '*':
//                     push(&s, operand1 * operand2);
//                     break;
//                 case '/':
//                     if (operand2 == 0) {
//                         printf("Division by zero error!\n");
//                         exit(1);
//                     }
//                     push(&s, operand1 / operand2);
//                     break;
//                 default:
//                     printf("Invalid operator: %c\n", postfix[i]);
//                     exit(1);
//             }
//         }
//     }

//     return pop(&s);
// }

// int main() {
//     char postfix[MAX];

//     printf("Enter a valid postfix expression: ");
//     scanf("%s", postfix);

//     int result = evaluatePostfix(postfix);

//     printf("Postfix Expression: %s\n", postfix);
//     printf("Result: %d\n", result);

//     return 0;
// }

// 04> Queue messaging system

// #include <stdio.h>
// #include <stdlib.h>
// #include <string.h>

// #define MAX 100

// typedef struct {
//     char messages[MAX][256];
//     int front;
//     int rear;
//     int size;
// } Queue;

// void initializeQueue(Queue *q) {
//     q->front = -1;
//     q->rear = -1;
//     q->size = 0;
// }

// int isFull(Queue *q) {
//     return q->size == MAX;
// }

// int isEmpty(Queue *q) {
//     return q->size == 0;
// }

// void enqueue(Queue *q, char *message) {
//     if (isFull(q)) {
//         printf("Queue is full. Cannot add message.\n");
//         return;
//     }
    
//     if (q->rear == MAX - 1) {
//         q->rear = -1;
//     }

//     q->rear++;
//     strcpy(q->messages[q->rear], message);
//     q->size++;
//     if (q->front == -1) {
//         q->front = 0;
//     }
// }

// void dequeue(Queue *q) {
//     if (isEmpty(q)) {
//         printf("Queue is empty. Cannot remove message.\n");
//         return;
//     }
    
//     printf("Removed message: %s\n", q->messages[q->front]);
//     q->front++;
//     if (q->front == MAX) {
//         q->front = 0;
//     }
//     q->size--;
// }

// void displayQueue(Queue *q) {
//     if (isEmpty(q)) {
//         printf("Queue is empty.\n");
//         return;
//     }
    
//     printf("Queue contents:\n");
//     int i = q->front;
//     int count = q->size;
//     while (count > 0) {
//         printf("%s\n", q->messages[i]);
//         i = (i + 1) % MAX;
//         count--;
//     }
// }

// int main() {
//     Queue q;
//     initializeQueue(&q);
    
//     int choice;
//     char message[256];
    
//     while (1) {
//         printf("\nMessaging System\n");
//         printf("1. Send Message\n");
//         printf("2. Receive Message\n");
//         printf("3. Display Messages\n");
//         printf("4. Exit\n");
//         printf("Enter your choice: ");
//         scanf("%d", &choice);
//         getchar();  // To consume the newline character
        
//         switch (choice) {
//             case 1:
//                 printf("Enter message: ");
//                 fgets(message, sizeof(message), stdin);
//                 message[strcspn(message, "\n")] = '\0';  // Remove trailing newline
//                 enqueue(&q, message);
//                 break;
//             case 2:
//                 dequeue(&q);
//                 break;
//             case 3:
//                 displayQueue(&q);
//                 break;
//             case 4:
//                 exit(0);
//             default:
//                 printf("Invalid choice. Please try again.\n");
//         }
//     }
    
//     return 0;
// }


// 05> Super Market scenario

// #include <stdio.h>
// #include <stdlib.h>
// #include <string.h>

// #define TABLE_SIZE 100

// typedef struct Customer {
//     int custid;
//     char custname[50];
//     char custphno[15];
//     struct Customer* next; // For handling collisions using chaining
// } Customer;

// Customer* hashTable[TABLE_SIZE];

// // Hash function to compute the index for a given custid
// int hashFunction(int custid) {
//     return custid % TABLE_SIZE;
// }

// // Insert customer details into the hash table
// void insertCustomer(int custid, char* custname, char* custphno) {
//     int index = hashFunction(custid);
//     Customer* newCustomer = (Customer*)malloc(sizeof(Customer));
//     newCustomer->custid = custid;
//     strcpy(newCustomer->custname, custname);
//     strcpy(newCustomer->custphno, custphno);
//     newCustomer->next = hashTable[index];
//     hashTable[index] = newCustomer;
// }

// // Search for a customer by custid
// Customer* searchCustomer(int custid) {
//     int index = hashFunction(custid);
//     Customer* temp = hashTable[index];
//     while (temp != NULL) {
//         if (temp->custid == custid) {
//             return temp;
//         }
//         temp = temp->next;
//     }
//     return NULL;
// }

// // Display a specific customer's details
// void displayCustomer(Customer* customer) {
//     if (customer) {
//         printf("Customer ID: %d\n", customer->custid);
//         printf("Customer Name: %s\n", customer->custname);
//         printf("Customer Phone Number: %s\n", customer->custphno);
//     } else {
//         printf("Customer not found!\n");
//     }
// }

// // Display all customers in the hash table
// void displayAllCustomers() {
//     for (int i = 0; i < TABLE_SIZE; i++) {
//         Customer* temp = hashTable[i];
//         while (temp != NULL) {
//             displayCustomer(temp);
//             temp = temp->next;
//             printf("\n"); // To separate each customer's details
//         }
//     }
// }

// int main() {
//     int choice, custid;
//     char custname[50], custphno[15];

//     while (1) {
//         printf("1. Add Customer\n2. Search Customer\n3. Display All Customers\n4. Exit\n");
//         printf("Enter your choice: ");
//         scanf("%d", &choice);

//         switch (choice) {
//             case 1:
//                 printf("Enter Customer ID: ");
//                 scanf("%d", &custid);
//                 printf("Enter Customer Name: ");
//                 scanf(" %[^\n]s", custname);
//                 printf("Enter Customer Phone: ");
//                 scanf(" %[^\n]s", custphno);
//                 insertCustomer(custid, custname, custphno);
//                 printf("Customer added successfully!\n");
//                 break;
//             case 2:
//                 printf("Enter Customer ID to search: ");
//                 scanf("%d", &custid);
//                 Customer* customer = searchCustomer(custid);
//                 displayCustomer(customer);
//                 break;
//             case 3:
//                 displayAllCustomers();
//                 break;
//             case 4:
//                 printf("Exiting...\n");
//                 exit(0);
//             default:
//                 printf("Invalid choice. Please try again.\n");
//         }
//     }

//     return 0;
// }

// 06> 
