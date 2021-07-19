# Mat size must be N X M. ( N is an odd natural number, and M is 3 times N .)
N, M = map(int, input().split())
Pattern = [(2*i + 1)*'.|.'.center(M,'-') for i in range(int(N/2))]
