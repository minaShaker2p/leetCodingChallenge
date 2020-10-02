package may.week2

fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {

    if(image[sr][sc]== newColor)
        return image

    fill(image,sr,sc,image[sr][sc],newColor)
    return image
}

private fun fill(image: Array<IntArray>, i : Int, j :Int, currentValue :Int, newColor: Int) {

    if( i < 0 || i >= image.size || j < 0 || j >= image[i].size || image[i][j] != currentValue)
        return
     image[i][j]= newColor
    fill(image,i+1,j,currentValue,newColor)
    fill(image,i-1,j,currentValue,newColor)
    fill(image,i,j+1,currentValue,newColor)
    fill(image,i,j-1,currentValue,newColor)
}