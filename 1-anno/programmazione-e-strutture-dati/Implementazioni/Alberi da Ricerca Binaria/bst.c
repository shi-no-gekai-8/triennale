#include <stdio.h>
#include <stdlib.h>
#include "item.h"
#include "bst.h"

struct node
{
    item value;
    struct node *left;
    struct node *right;
};

item getItem(struct node *N);
void setItem(struct node *N, item el);

item getItem(struct node *N)
{
    if (N == NULL)
    {
        return NULLITEM;
    }
    return N->value;
}

void setItem(struct node *N, item el)
{
    if (N == NULL)
    {
        return;
    }
    N->value = el;
}

BST newBST(void)
{
    return NULL;
}

int emptyBST(BST T)
{
    return T == NULL;
}

int contains(BST T, item val)
{
    if (T == NULL)
    {
        return 0;
    }
    if (eq(val, getItem(T)))
    {
        return 1;
    }
    if (minore(val, getItem(T)))
    {
        return (contains(figlioSX(T), val));
    }
    else
    {
        return (contains(figlioDX(T), val));
    }
}

BST insert(BST T, item elem)
{
    if (T == NULL)
    {
        return creaFoglia(elem);
    }
    else if (minore(elem, getItem(T)))
    {
        T->left = insert(T->left, elem);
    }
    else if (minore(getItem(T), elem))
    {
        T->right = insert(T->right, elem);
    }
    return T;
}
BST creaFoglia(item elem)
{
    BST N = malloc(sizeof(struct node));
    if (N == NULL)
    {
        return NULL;
    }
    N->value = elem;
    N->left = NULL;
    N->right = NULL;
    return N;
}

BST deleteNode(BST root, item key)
{
    if (root == NULL)
    {
        return root;
    }
    if (minore(key, root->value))
    {
        root->left = deleteNode(root->left, key);
    }
    else if (minore(root->value, key))
    {
        root->right = deleteNode(root->right, key);
    }
    else
    {
        if (root->left == NULL)
        {
            struct node *temp = root->right;
            free(root);
            return temp;
        }
        else if (root->right == NULL)
        {
            struct node *temp = root->left;
            free(root);
            return temp;
        }
        struct node *temp = minValue(root->right);
        root->value = temp->value;
        root->right = deleteNode(root->right, temp->value);
    }
    return root;
}

BST minValue(BST node)
{
    struct node *current = node;
    while (current->left != NULL)
    {
        current = current->left;
    }
    return current;
}

void inOrder(BST T)
{
    if (T == NULL)
    {
        return;
    }
    inOrder(T->left);
    printf("%d ", getItem(T));
    inOrder(T->right);
}

BST figlioSX(BST T)
{
    if (T != NULL)
    {
        return T->left;
    }
    else
    {
        return NULL;
    }
}

BST figlioDX(BST T)
{
    if (T != NULL)
    {
        return T->right;
    }
    else
    {
        return NULL;
    }
}

int altezza(struct node *N)
{
    if (N == NULL)
    {
        return 0;
    }
    int altezzaSX = altezza(N->left);
    int altezzaDX = altezza(N->right);
    return (altezzaSX > altezzaDX ? altezzaSX : altezzaDX) + 1;
}

bool isBilanciato(struct node *root)
{
    if (root == NULL)
    {
        return true;
    }
    int altezzaSX = altezza(root->left);
    int altezzaDX = altezza(root->right);
    if (abs(altezzaSX - altezzaDX) > 1)
    {
        return false;
    }
    return isBilanciato(root->left) && isBilanciato(root->right);
}