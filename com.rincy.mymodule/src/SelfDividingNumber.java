public class SelfDividingNumber {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> resultList = new ArrayList<Integer>();
        OUTER_FORLOOP: for(int i=left; i<=right; i++)
        {
            if(i%10==0)
            {
                continue;
            }
            if(i<10)
            {
                resultList.add(i);
            }
            else
            {
                int tmp = i;
                while(tmp >0)
                {
                    if(tmp%10==0)
                    {
                        continue OUTER_FORLOOP;
                    }
                    if(((i) % (tmp%10)) == 0)
                    {
                        tmp = tmp/10;
                    }
                    else
                    {
                        continue OUTER_FORLOOP;

                    }
                }
                resultList.add(i);
            }
        }
        return resultList;

    }
}
