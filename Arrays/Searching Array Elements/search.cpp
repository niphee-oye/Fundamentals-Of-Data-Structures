#include <iostream>
using namespace std;

int main(){
    int array[] = {1,2,3,4,5,6,7,8};
    int element;

    cout << " " << endl;
    cout << "Enter the element hat is to be searched for: ";
    cin >> element;
    cout << " " << endl;

    for (int i = 0; i < 8; i++)
    {
        if (element == array[i])
        {
            cout << "The element has been found at index " << i << endl;
        }
    }cout << " " << endl;
    
}