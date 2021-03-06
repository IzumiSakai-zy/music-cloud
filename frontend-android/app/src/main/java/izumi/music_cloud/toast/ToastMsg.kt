package izumi.music_cloud.toast

enum class ToastMsg(val msg: String) {
    GET_SONG_LIST_ERROR("Fail to load your playlist, please checkout internet or contact via izumisakai@aliyun.com"),
    DOWNLOAD_SONG_ERROR("Fail to download music, please checkout internet or contact via izumisakai@aliyun.com"),
    DOWNLOADING_NOT_ALLOW_CLICK("It's downloading now, please wait for a while"),
    NOT_AUTHORIZE_STORAGE_PERMISSION("Please grant storage permission"),
    NOT_IMPLEMENT_PLAY_PREVIOUS("Haha, surprising to find it doesn't support playing the previous song"),
    NOT_SELECT_A_MP3_FILE("Only mp3 file is supported, please choose a mp3 file"),
    UploadSuccess("Upload successfully"),
    MUSIC_SIZE_OVER_TEN_M("Sorry, only supports up to 10M. Please choose a file less than 10M"),
    NOT_IMPLEMENTED("Not implemented")
}