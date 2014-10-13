#include <stdio.h>
#include <string.h>

void rev_string(char * string, int str_len);

int main(int argc, char ** args) {
    // Test Cases
	char test1[] = "wonderful";
    char test2[] = "racecar";
    char test3[] = "1";
    char test4[] = "extremelylong string with spaces";

    // Reverse Strings
    rev_string(test1,strlen(test1));
    rev_string(test2,strlen(test2));
    rev_string(test3,strlen(test3));
    rev_string(test4,strlen(test4));
    
    
    // Print Test Cases
    printf("%s\n",test1);
    printf("%s\n",test2);
    printf("%s\n",test3);
    printf("%s\n",test4);
    
}

// Reversal Code
void rev_string(char * string, int str_len) {
	char swap;
    // Stop at halfway point
	for (int i = (str_len-1); i >= str_len/2; i--) {
		swap = (*(string+i));
        (*(string+i)) = (*(string+(str_len-1-i)));
        (*(string+(str_len-1-i))) = swap;
    }
}