// Vamos a crear un modulo  de angular

angular.module("CameraApp", [])
    .constant("baseUrl", "http://localhost:9000/api/")
    .controller("MainController", function ($scope, $http, baseUrl) {
        $scope.selectedVideo = "Christmas";
        // en el link la variable de alcance va a ser la de $scope, la del final
        $scope.selectedVideo = baseUrl + "camera/fromvideo/?videoName=" + $scope.selectedVideo;
        $scope.videoPlayerElement = null;

        $scope.getVideos = function () {
            $http.get(baseUrl + "videos").success(function (data) {
                $scope.videos = data;
            })
        }

        $scope.getVideos = function () {
            $http.get({
                    method: 'GET',
                    url: baseUrl + "videos"
                })
                .success(function (data, status) {
                    console.log('data::', data, status);
                    $scope.videos = data;
                })
                .error(function (error, status) {
                    console.log('Error::', error, status);
                });
        }

        angular.element(document).ready(function () {
            $scope.videoPlayerElement = document.getElementById("videoPlayer");
        })

        $scope.start = () => {
            $scope.selectedVideoUrl = baseUrl + "camera/fromvideo/?videoName=" + $scope.selectedVideo;
            $scope.videoPlayerElement.src = $scope.selectedVideoUrl;
            $scope.videoPlayerElement.play();
        }

        $scope.stop = () => {
            $scope.videoPlayerElement.pause();
        }

        $scope.getVideos();
    })