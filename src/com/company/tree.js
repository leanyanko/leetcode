const solution = (tree) => {
    // Type your solution here
    if (tree.length == 0) return 0;
    num = 2;
    i = 1;
    height = 1;
    while(i < tree.length) {
        j = 0;
        islevel = false;
        while(j < num) {
            if (tree[j + i] > -1) islevel = true;
            j++;
        }
        if (islevel) height++;
        i += j;
        num *= 2;
    }
    return height;
};