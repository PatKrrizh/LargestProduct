package MyPackage;

public class MaxProduct {

    public static void main(String args[])
    {
        int num[] = new int[] {-5, -1, 6, 2, 4, -8, 1};
        maximum_product_of_three(num);
    }

    public static void maximum_product_of_three(int num[])
    {
        int pos[] = new int[] {0, 0, 0, 0, 0, 0, 0};
        int neg[] = new int[] {0, 0, 0, 0, 0, 0, 0};
        int arr[] = new int[] {0, 0, 0};
        int sum1 = 1;
        int sum2 = 1;

        for(int i=0; i<num.length; i++)
        {
            if(num[i] >= 0)
            {
                pos[i] = num[i];
            }
            else
            {
                neg[i] = num[i];
            }
        }
        for(int i=0; i<pos.length; i++)
        {
            for(int j=i+1; j<pos.length; j++)
            {
                if(pos[i] < pos[j])
                {
                    int a;
                    a = pos[i];
                    pos[i] = pos[j];
                    pos[j] = a;
                }
                if(neg[i] > neg[j])
                {
                    int a;
                    a = neg[i];
                    neg[i] = neg[j];
                    neg[j] = a;
                }
            }
        }

        /*for(int i=0; i<num.length; i++)
        {
            System.out.println(pos[i]);
            System.out.println(neg[i]);
        }*/
        int a=0, b=0;
        for(int i=0; i<arr.length; i++)
        {
            if(neg[i]<0 && a<2)
            {
                sum1 = sum1 * neg[a];
                a += 1;
            }
            else
            {
                sum1 = sum1 * pos[b];
                b += 1;
            }
        }

        for(int i=0; i<arr.length; i++)
        {
            sum2 = sum2 * pos[i];
        }
        if(sum1 > sum2)
        {
            System.out.println(sum1);
        }
        else
        {
            System.out.println(sum2);
        }

    }
}
