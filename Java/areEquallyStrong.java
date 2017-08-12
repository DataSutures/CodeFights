boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
    return (yourLeft == friendsRight && yourRight == friendsLeft) || (yourLeft == friendsLeft && yourRight == friendsRight);
}