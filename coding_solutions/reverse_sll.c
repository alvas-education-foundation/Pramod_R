//Write a C Program to Reverse a Linked List (SLL) in groups of given size.
/*Test Case 1:
If a linked listis: 1 → 2 → 3 → 4 → 5 → 6 → 7 → 8
The value of size k is 2
Then the linked list looks like: 2 → 1 → 4 → 3 → 6 → 5 → 8 → 7

Test Case 2:
If a linked listis: 1 → 2 → 3 → 4 → 5 → 6 → 7 → 8
The value of size k is 3
Then the linked list looks like: 3 → 2 → 1 → 6 → 5 → 4 → 8 → 7
*/

#include<stdio.h>
#include<stdlib.h>
struct node
{
    int num;
    struct node *next;
};
void create(struct node **);
void reverse(struct node **);
void release(struct node **);
void display(struct node *);
int main()
{
    struct node *p = NULL;
    int n;
    printf("Enter data into the list\n");
    create(&p);
    printf("Displaying the nodes in the list:\n");
    display(p);
    printf("Reversing the list...\n");
    reverse(&p);
    printf("Displaying the reversed list:\n");
    display(p);
    release(&p);
    return 0;
}
void reverse(struct node **head)
{
    struct node *p, *q, *r;
    p = q = r = *head;
    p = p->next->next;
    q = q->next;
    r->next = NULL;
    q->next = r;
    while (p != NULL)
    {
        r = q;
        q = p;
        p = p->next;
        q->next = r;
    }
    *head = q;
}
void create(struct node **head)
{
    int c, ch;
    struct node *temp, *rear;
 
    do
    {
        printf("Enter number: ");
        scanf("%d", &c);
        temp = (struct node *)malloc(sizeof(struct node));
        temp->num = c;
        temp->next = NULL;
        if (*head == NULL)
        {
            *head = temp;
        }
        else
        {
            rear->next = temp;
        }
        rear = temp;
        printf("Do you wish to continue [1/0]: ");
        scanf("%d", &ch);
    } while (ch != 0);
    printf("\n");
}
void display(struct node *p)
{
    while (p != NULL)
    {
        printf("%d\t", p->num);
        p = p->next;
    }
    printf("\n");
}
void release(struct node **head)
{
    struct node *temp = *head;
    *head = (*head)->next;
    while ((*head) != NULL)
    {
        free(temp);
        temp = *head;
        (*head) = (*head)->next;
    }
}