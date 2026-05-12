class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();
        for( int i =0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                str.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        String sans= str.toString();
//         return str.toString().equals(str.reverse().toString());
//     }
// }
int l=0;
int r=sans.length()-1;
while(l<=r)
{
    if(sans.charAt(l)==sans.charAt(r))
    {
        l++;
        r--;
    }
    else
    {
        return false;
    }
}
return true;
    }
}

